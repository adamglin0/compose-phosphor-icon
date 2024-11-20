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

public val ThinGroup.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) {
            return _pixLogo!!
        }
        _pixLogo = Builder(name = "PixLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.5f, 119.55f)
                lineToRelative(-96.05f, -96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.9f, 0.0f)
                lineToRelative(-96.0f, 96.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 16.9f)
                lineToRelative(96.05f, 96.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 0.0f)
                lineToRelative(96.05f, -96.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.9f)
                close()
                moveTo(125.21f, 29.16f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 5.58f, 0.0f)
                lineTo(193.64f, 92.0f)
                lineTo(160.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f)
                lineTo(128.0f, 122.34f)
                lineTo(98.83f, 93.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 92.0f)
                lineTo(62.36f, 92.0f)
                close()
                moveTo(28.0f, 128.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.16f, -2.79f)
                lineTo(54.36f, 100.0f)
                horizontalLineToRelative(40.0f)
                lineToRelative(28.0f, 28.0f)
                lineToRelative(-28.0f, 28.0f)
                horizontalLineToRelative(-40.0f)
                lineToRelative(-25.2f, -25.21f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 28.0f, 128.0f)
                close()
                moveTo(130.79f, 226.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.58f, 0.0f)
                lineTo(62.36f, 164.0f)
                lineTo(96.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineTo(128.0f, 133.66f)
                lineToRelative(29.17f, 29.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 164.0f)
                horizontalLineToRelative(33.64f)
                close()
                moveTo(226.84f, 130.79f)
                lineTo(201.64f, 156.0f)
                horizontalLineToRelative(-40.0f)
                lineToRelative(-28.0f, -28.0f)
                lineToRelative(28.0f, -28.0f)
                horizontalLineToRelative(40.0f)
                lineToRelative(25.2f, 25.21f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 0.0f, 5.58f)
                close()
            }
        }
        .build()
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
