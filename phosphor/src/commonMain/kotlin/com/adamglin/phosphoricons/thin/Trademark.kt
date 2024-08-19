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

public val ThinGroup.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(108.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(92.0f, 108.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(84.0f, 108.0f)
                lineTo(72.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 104.0f)
                close()
                moveTo(188.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(180.0f, 114.65f)
                lineToRelative(-21.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-21.0f, -24.0f)
                lineTo(132.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, -2.63f)
                lineToRelative(25.0f, 28.56f)
                lineToRelative(25.0f, -28.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, 2.63f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null
