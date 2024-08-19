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

public val ThinGroup.Clipboardtext: ImageVector
    get() {
        if (_clipboardtext != null) {
            return _clipboardtext!!
        }
        _clipboardtext = Builder(name = "Clipboardtext", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 152.0f)
                close()
                moveTo(160.0f, 116.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(212.0f, 48.0f)
                lineTo(212.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(56.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(44.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 36.0f)
                lineTo(94.08f, 36.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 67.84f, 0.0f)
                lineTo(200.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 48.0f)
                close()
                moveTo(92.0f, 64.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(72.0f)
                lineTo(164.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                close()
                moveTo(204.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(167.17f, 44.0f)
                arcTo(43.71f, 43.71f, 0.0f, false, true, 172.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(84.0f, 64.0f)
                arcToRelative(43.71f, 43.71f, 0.0f, false, true, 4.83f, -20.0f)
                lineTo(56.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(52.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _clipboardtext!!
    }

private var _clipboardtext: ImageVector? = null
