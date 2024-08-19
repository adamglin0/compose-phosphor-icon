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

public val ThinGroup.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(228.11f, 228.11f, 0.0f, false, false, -66.42f, 9.84f)
                arcToRelative(256.45f, 256.45f, 0.0f, false, false, -27.66f, -15.67f)
                arcTo(250.1f, 250.1f, 0.0f, false, true, 232.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                quadToRelative(-10.06f, 0.0f, -20.0f, 0.76f)
                lineTo(212.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.6f, -3.2f)
                lineToRelative(-64.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 0.0f)
                lineToRelative(-64.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 76.0f, 80.0f)
                verticalLineToRelative(41.2f)
                arcTo(261.74f, 261.74f, 0.0f, false, false, 24.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(251.0f, 251.0f, 0.0f, false, true, 196.73f, 94.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.24f, -5.0f)
                arcToRelative(262.61f, 262.61f, 0.0f, false, false, -21.44f, -23.64f)
                arcTo(190.11f, 190.11f, 0.0f, false, true, 232.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(198.15f, 198.15f, 0.0f, false, false, -33.84f, 2.92f)
                arcToRelative(261.44f, 261.44f, 0.0f, false, false, -24.0f, -19.25f)
                arcTo(220.46f, 220.46f, 0.0f, false, true, 232.0f, 156.0f)
                close()
                moveTo(164.0f, 125.0f)
                arcToRelative(259.84f, 259.84f, 0.0f, false, false, -35.93f, 12.65f)
                curveToRelative(-1.36f, -0.58f, -2.71f, -1.18f, -4.07f, -1.74f)
                lineTo(124.0f, 100.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(84.0f, 82.0f)
                lineToRelative(60.0f, -45.0f)
                lineToRelative(60.0f, 45.0f)
                verticalLineToRelative(35.49f)
                arcToRelative(258.55f, 258.55f, 0.0f, false, false, -32.0f, 5.45f)
                lineTo(172.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(120.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(36.71f)
                arcTo(258.64f, 258.64f, 0.0f, false, false, 84.0f, 123.0f)
                close()
                moveTo(133.5f, 218.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.55f, 1.12f)
                arcTo(187.08f, 187.08f, 0.0f, false, false, 24.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(195.12f, 195.12f, 0.0f, false, true, 108.38f, 32.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 133.5f, 218.21f)
                close()
                moveTo(183.57f, 213.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 5.72f)
                arcTo(218.76f, 218.76f, 0.0f, false, false, 24.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(226.71f, 226.71f, 0.0f, false, true, 183.57f, 213.14f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
