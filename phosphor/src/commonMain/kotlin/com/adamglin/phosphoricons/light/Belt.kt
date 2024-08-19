package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Belt: ImageVector
    get() {
        if (_belt != null) {
            return _belt!!
        }
        _belt = Builder(name = "Belt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 162.0f)
                lineTo(190.0f, 162.0f)
                lineTo(190.0f, 94.0f)
                horizontalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(188.63f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 176.0f, 74.0f)
                lineTo(112.0f, 74.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.63f, 8.0f)
                lineTo(62.0f, 82.0f)
                lineTo(62.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 82.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 94.0f)
                lineTo(50.0f, 94.0f)
                verticalLineToRelative(68.0f)
                lineTo(8.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 174.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                lineTo(99.37f, 174.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 112.0f, 182.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.63f, -8.0f)
                lineTo(248.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(62.0f, 94.0f)
                lineTo(98.0f, 94.0f)
                verticalLineToRelative(68.0f)
                lineTo(62.0f, 162.0f)
                close()
                moveTo(176.0f, 170.0f)
                lineTo(112.0f, 170.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(110.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(34.0f)
                lineTo(144.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 176.0f, 170.0f)
                close()
            }
        }
        .build()
        return _belt!!
    }

private var _belt: ImageVector? = null
