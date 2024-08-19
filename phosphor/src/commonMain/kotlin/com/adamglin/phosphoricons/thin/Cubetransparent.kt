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

public val ThinGroup.Cubetransparent: ImageVector
    get() {
        if (_cubetransparent != null) {
            return _cubetransparent!!
        }
        _cubetransparent = Builder(name = "Cubetransparent", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.92f, 95.22f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.1f, -0.33f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, false, -0.13f, -0.42f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -0.19f, -0.37f)
                curveToRelative(-0.06f, -0.11f, -0.11f, -0.22f, -0.17f, -0.32f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, false, -0.5f, -0.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-56.0f, -56.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, -0.33f, -0.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.9f, 2.5f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, 0.27f, 0.33f)
                lineToRelative(56.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 220.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 96.0f)
                arcTo(4.13f, 4.13f, 0.0f, false, false, 219.92f, 95.22f)
                close()
                moveTo(164.0f, 49.66f)
                lineTo(206.34f, 92.0f)
                lineTo(164.0f, 92.0f)
                close()
                moveTo(92.0f, 206.34f)
                lineTo(49.66f, 164.0f)
                lineTo(92.0f, 164.0f)
                close()
                moveTo(92.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                lineTo(44.0f, 49.66f)
                lineToRelative(48.0f, 48.0f)
                close()
                moveTo(49.66f, 44.0f)
                lineTo(156.0f, 44.0f)
                lineTo(156.0f, 92.0f)
                lineTo(97.66f, 92.0f)
                close()
                moveTo(156.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(100.0f, 156.0f)
                lineTo(100.0f, 100.0f)
                close()
                moveTo(100.0f, 212.0f)
                lineTo(100.0f, 164.0f)
                horizontalLineToRelative(58.34f)
                lineToRelative(48.0f, 48.0f)
                close()
                moveTo(212.0f, 206.34f)
                lineTo(164.0f, 158.34f)
                lineTo(164.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _cubetransparent!!
    }

private var _cubetransparent: ImageVector? = null
