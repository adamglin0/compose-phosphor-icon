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

public val ThinGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(40.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(220.0f, 168.4f)
                lineToRelative(-32.89f, -32.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-22.83f, 22.83f)
                lineToRelative(-46.82f, -46.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(36.0f, 159.0f)
                lineTo(36.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f)
                close()
                moveTo(36.0f, 200.0f)
                lineTo(36.0f, 170.34f)
                lineToRelative(53.17f, -53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(181.66f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 200.0f)
                close()
                moveTo(216.0f, 204.0f)
                lineTo(193.0f, 204.0f)
                lineToRelative(-40.0f, -40.0f)
                lineToRelative(22.83f, -22.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(220.0f, 179.71f)
                lineTo(220.0f, 200.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f)
                close()
                moveTo(148.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 148.0f, 100.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
