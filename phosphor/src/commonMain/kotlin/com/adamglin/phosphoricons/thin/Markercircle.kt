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

public val ThinGroup.Markercircle: ImageVector
    get() {
        if (_markercircle != null) {
            return _markercircle!!
        }
        _markercircle = Builder(name = "Markercircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.71f, 57.29f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f)
                close()
                moveTo(84.0f, 208.83f)
                lineTo(84.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(32.83f)
                arcToRelative(92.25f, 92.25f, 0.0f, false, true, -88.0f, 0.0f)
                close()
                moveTo(108.15f, 140.0f)
                lineTo(152.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(100.0f, 164.0f)
                lineTo(100.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(113.08f, 132.0f)
                lineTo(124.08f, 79.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.84f, 0.0f)
                lineToRelative(11.0f, 52.82f)
                close()
                moveTo(193.08f, 193.05f)
                arcTo(92.41f, 92.41f, 0.0f, false, true, 180.0f, 203.9f)
                lineTo(180.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(164.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-0.91f)
                lineTo(139.75f, 77.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.5f, 0.0f)
                lineTo(104.91f, 132.0f)
                lineTo(104.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                lineTo(88.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(27.9f)
                arcToRelative(92.41f, 92.41f, 0.0f, false, true, -13.0f, -10.85f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 130.1f, 0.0f)
                close()
            }
        }
        .build()
        return _markercircle!!
    }

private var _markercircle: ImageVector? = null
