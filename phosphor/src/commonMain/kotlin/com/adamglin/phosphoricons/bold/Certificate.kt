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

public val BoldGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(72.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 140.0f)
                close()
                moveTo(116.0f, 88.0f)
                lineTo(72.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(236.0f, 167.14f)
                lineTo(236.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.95f, 10.42f)
                lineTo(196.0f, 225.82f)
                lineTo(174.0f, 238.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 228.0f)
                lineTo(156.0f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(236.0f, 88.86f)
                arcToRelative(55.87f, 55.87f, 0.0f, false, true, 0.0f, 78.28f)
                close()
                moveTo(196.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 196.0f, 160.0f)
                close()
                moveTo(156.0f, 180.0f)
                lineTo(156.0f, 167.14f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 56.0f, -92.8f)
                lineTo(212.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 180.0f)
                close()
                moveTo(212.0f, 207.32f)
                lineTo(212.0f, 181.66f)
                arcToRelative(55.87f, 55.87f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineToRelative(25.66f)
                lineToRelative(10.05f, -5.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.9f, 0.0f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
