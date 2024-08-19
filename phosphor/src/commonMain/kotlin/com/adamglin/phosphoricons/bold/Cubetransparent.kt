package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Cubetransparent: ImageVector
    get() {
        if (_cubetransparent != null) {
            return _cubetransparent!!
        }
        _cubetransparent = Builder(name = "Cubetransparent", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.5f, 95.53f)
                verticalLineToRelative(0.0f)
                lineToRelative(-64.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 152.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, 7.93f)
                curveToRelative(0.15f, 0.18f, 0.31f, 0.36f, 0.5f, 0.56f)
                lineToRelative(64.0f, 64.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 228.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.5f, 95.53f)
                close()
                moveTo(164.0f, 69.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(164.0f, 92.0f)
                close()
                moveTo(92.0f, 187.0f)
                lineTo(69.0f, 164.0f)
                lineTo(92.0f, 164.0f)
                close()
                moveTo(92.0f, 140.0f)
                lineTo(52.0f, 140.0f)
                lineTo(52.0f, 69.0f)
                lineToRelative(40.0f, 40.0f)
                close()
                moveTo(69.0f, 52.0f)
                horizontalLineToRelative(71.0f)
                lineTo(140.0f, 92.0f)
                lineTo(109.0f, 92.0f)
                close()
                moveTo(140.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(116.0f, 140.0f)
                lineTo(116.0f, 116.0f)
                close()
                moveTo(116.0f, 204.0f)
                lineTo(116.0f, 164.0f)
                horizontalLineToRelative(31.0f)
                lineToRelative(40.0f, 40.0f)
                close()
                moveTo(204.0f, 187.0f)
                lineTo(164.0f, 147.0f)
                lineTo(164.0f, 116.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _cubetransparent!!
    }

private var _cubetransparent: ImageVector? = null
