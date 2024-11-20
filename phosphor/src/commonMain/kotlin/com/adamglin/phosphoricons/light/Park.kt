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

public val LightGroup.Park: ImageVector
    get() {
        if (_park != null) {
            return _park!!
        }
        _park = Builder(name = "Park", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 194.0f)
                lineTo(198.0f, 194.0f)
                lineTo(198.0f, 166.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.82f, -7.46f)
                lineToRelative(-32.0f, -128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.64f, 0.0f)
                lineToRelative(-32.0f, 128.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 166.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(28.0f)
                lineTo(118.0f, 194.0f)
                lineTo(118.0f, 174.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(118.0f, 162.0f)
                lineTo(118.0f, 142.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 142.0f)
                verticalLineToRelative(20.0f)
                lineTo(40.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 174.0f)
                verticalLineToRelative(20.0f)
                lineTo(24.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(192.0f, 56.74f)
                lineTo(216.32f, 154.0f)
                lineTo(167.68f, 154.0f)
                close()
                moveTo(62.0f, 142.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(20.0f)
                lineTo(62.0f, 162.0f)
                close()
                moveTo(62.0f, 174.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(20.0f)
                lineTo(62.0f, 194.0f)
                close()
                moveTo(116.0f, 94.0f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 90.0f, 68.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 116.0f, 94.0f)
                close()
                moveTo(116.0f, 54.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 116.0f, 54.0f)
                close()
            }
        }
        .build()
        return _park!!
    }

private var _park: ImageVector? = null
