package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Belt: ImageVector
    get() {
        if (_belt != null) {
            return _belt!!
        }
        _belt = Builder(name = "Belt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 164.0f)
                lineTo(188.0f, 164.0f)
                lineTo(188.0f, 92.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(187.3f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 76.0f)
                lineTo(112.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.3f, 8.0f)
                lineTo(60.0f, 84.0f)
                lineTo(60.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 92.0f)
                verticalLineToRelative(72.0f)
                lineTo(8.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 172.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(40.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, -8.0f)
                lineTo(248.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(60.0f, 92.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(72.0f)
                lineTo(60.0f, 164.0f)
                close()
                moveTo(176.0f, 172.0f)
                lineTo(112.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(108.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(36.0f)
                lineTo(144.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.0f, 172.0f)
                close()
            }
        }
        .build()
        return _belt!!
    }

private var _belt: ImageVector? = null
