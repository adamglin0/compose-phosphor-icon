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

public val ThinGroup.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) {
            return _seatbelt!!
        }
        _seatbelt = Builder(name = "Seatbelt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 108.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 88.0f, 68.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 108.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 68.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(204.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.65f, -7.0f)
                lineToRelative(103.0f, -90.84f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -95.44f, 51.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.37f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -0.64f, -0.05f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 53.0f, 179.89f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 162.8f, 124.43f)
                lineTo(189.35f, 101.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.3f, 6.0f)
                lineTo(66.58f, 220.0f)
                lineTo(200.0f, 220.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 224.0f)
                close()
                moveTo(190.44f, 148.67f)
                arcTo(75.52f, 75.52f, 0.0f, false, true, 204.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(67.55f, 67.55f, 0.0f, false, false, -12.13f, -38.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.57f, -4.56f)
                close()
            }
        }
        .build()
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
