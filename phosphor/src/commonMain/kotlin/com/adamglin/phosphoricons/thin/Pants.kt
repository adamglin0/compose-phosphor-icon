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

public val ThinGroup.Pants: ImageVector
    get() {
        if (_pants != null) {
            return _pants!!
        }
        _pants = Builder(name = "Pants", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.91f, 214.51f)
                lineToRelative(-22.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 186.0f, 28.0f)
                lineTo(70.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 58.09f, 38.51f)
                lineToRelative(-22.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 228.0f)
                lineTo(88.69f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.64f, -9.06f)
                lineTo(128.0f, 112.0f)
                lineToRelative(27.67f, 106.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 167.31f, 228.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.91f, -13.49f)
                close()
                moveTo(197.52f, 99.9f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 164.23f, 68.0f)
                horizontalLineToRelative(29.3f)
                close()
                moveTo(70.0f, 36.0f)
                lineTo(186.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.5f)
                lineTo(192.53f, 60.0f)
                lineTo(63.47f, 60.0f)
                lineTo(66.0f, 39.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 70.0f, 36.0f)
                close()
                moveTo(62.47f, 68.0f)
                horizontalLineToRelative(29.3f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 58.48f, 99.9f)
                close()
                moveTo(92.57f, 217.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 3.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.5f)
                lineTo(57.47f, 108.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 99.81f, 68.0f)
                lineTo(124.0f, 68.0f)
                lineTo(124.0f, 95.49f)
                close()
                moveTo(211.0f, 218.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.35f)
                lineTo(167.31f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.89f, -3.06f)
                lineTo(132.0f, 95.49f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(24.19f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 42.34f, 40.0f)
                lineTo(212.0f, 215.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.0f, 218.65f)
                close()
            }
        }
        .build()
        return _pants!!
    }

private var _pants: ImageVector? = null
