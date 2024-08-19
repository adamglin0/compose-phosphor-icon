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

public val ThinGroup.Bellsimpleringing: ImageVector
    get() {
        if (_bellsimpleringing != null) {
            return _bellsimpleringing!!
        }
        _bellsimpleringing = Builder(name = "Bellsimpleringing", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f)
                close()
                moveTo(223.84f, 62.16f)
                arcToRelative(107.34f, 107.34f, 0.0f, false, false, -37.71f, -41.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.26f, 6.76f)
                arcToRelative(99.41f, 99.41f, 0.0f, false, true, 34.87f, 38.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.29f, 68.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 1.84f, -0.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 223.84f, 62.16f)
                close()
                moveTo(39.26f, 65.84f)
                arcTo(99.41f, 99.41f, 0.0f, false, true, 74.13f, 27.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.26f, -6.76f)
                arcTo(107.34f, 107.34f, 0.0f, false, false, 32.16f, 62.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.71f, 5.39f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 1.84f, 0.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 39.26f, 65.84f)
                close()
                moveTo(218.36f, 178.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 196.0f)
                lineTo(48.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 37.64f, 178.0f)
                curveTo(47.17f, 161.56f, 52.0f, 139.37f, 52.0f, 112.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.0f, 139.36f, 208.83f, 161.55f, 218.36f, 178.0f)
                close()
                moveTo(211.44f, 182.0f)
                curveTo(201.19f, 164.34f, 196.0f, 140.79f, 196.0f, 112.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                curveToRelative(0.0f, 28.8f, -5.19f, 52.34f, -15.44f, 70.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(3.89f, 3.89f, 0.0f, false, false, 48.0f, 188.0f)
                lineTo(208.0f, 188.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, 3.43f, -2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 211.44f, 182.0f)
                close()
            }
        }
        .build()
        return _bellsimpleringing!!
    }

private var _bellsimpleringing: ImageVector? = null
