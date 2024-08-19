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

public val ThinGroup.Filecloud: ImageVector
    get() {
        if (_filecloud != null) {
            return _filecloud!!
        }
        _filecloud = Builder(name = "Filecloud", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.83f, 85.17f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                lineTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(176.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 85.17f)
                close()
                moveTo(156.0f, 41.65f)
                lineTo(198.34f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
                moveTo(108.0f, 132.0f)
                arcToRelative(47.72f, 47.72f, 0.0f, false, false, -45.3f, 32.0f)
                lineTo(60.0f, 164.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                close()
                moveTo(108.0f, 220.0f)
                lineTo(60.0f, 220.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -48.0f)
                horizontalLineToRelative(0.66f)
                curveToRelative(-0.2f, 1.2f, -0.35f, 2.41f, -0.46f, 3.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.72f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, true, 1.23f, -6.92f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, false, 0.21f, -0.73f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 108.0f, 220.0f)
                close()
            }
        }
        .build()
        return _filecloud!!
    }

private var _filecloud: ImageVector? = null
