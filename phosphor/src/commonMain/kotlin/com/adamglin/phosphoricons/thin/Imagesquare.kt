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

public val ThinGroup.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) {
            return _imageSquare!!
        }
        _imageSquare = Builder(name = "ImageSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(87.0f)
                lineToRelative(-31.51f, -31.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(55.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(66.34f, 212.0f)
                lineTo(169.17f, 109.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(212.0f, 146.34f)
                lineTo(212.0f, 208.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(96.0f, 116.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 76.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 116.0f)
                close()
                moveTo(96.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 84.0f)
                close()
            }
        }
        .build()
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
