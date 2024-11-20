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

public val BoldGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 204.5f)
                lineTo(204.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(180.0f, 204.5f)
                arcToRelative(59.68f, 59.68f, 0.0f, false, false, -33.17f, -53.67f)
                lineToRelative(-48.4f, -24.2f)
                arcTo(83.54f, 83.54f, 0.0f, false, true, 52.0f, 51.5f)
                lineTo(52.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(76.0f, 51.5f)
                arcToRelative(59.68f, 59.68f, 0.0f, false, false, 33.17f, 53.67f)
                lineToRelative(48.4f, 24.2f)
                arcTo(83.54f, 83.54f, 0.0f, false, true, 204.0f, 204.5f)
                close()
                moveTo(152.0f, 204.0f)
                lineTo(76.0f, 204.0f)
                arcToRelative(59.75f, 59.75f, 0.0f, false, true, 2.34f, -16.0f)
                horizontalLineToRelative(56.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(91.76f, 164.0f)
                curveToRelative(1.0f, -1.1f, 2.0f, -2.18f, 3.13f, -3.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.45f, -17.48f)
                arcTo(84.38f, 84.38f, 0.0f, false, false, 52.0f, 204.5f)
                lineTo(52.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(192.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(104.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(59.75f, 59.75f, 0.0f, false, true, -2.34f, 16.0f)
                lineTo(121.44f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(42.8f)
                curveToRelative(-1.0f, 1.1f, -2.0f, 2.18f, -3.13f, 3.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.45f, 17.48f)
                arcTo(84.38f, 84.38f, 0.0f, false, false, 204.0f, 51.5f)
                lineTo(204.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 12.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
