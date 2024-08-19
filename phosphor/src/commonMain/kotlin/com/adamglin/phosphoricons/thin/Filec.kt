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

public val ThinGroup.Filec: ImageVector
    get() {
        if (_filec != null) {
            return _filec!!
        }
        _filec = Builder(name = "Filec", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 180.0f)
                curveToRelative(0.0f, 13.23f, 9.0f, 24.0f, 20.0f, 24.0f)
                arcToRelative(18.15f, 18.15f, 0.0f, false, false, 13.11f, -5.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.78f, 5.54f)
                arcTo(26.11f, 26.11f, 0.0f, false, true, 64.0f, 212.0f)
                curveToRelative(-15.44f, 0.0f, -28.0f, -14.36f, -28.0f, -32.0f)
                reflectiveCurveToRelative(12.56f, -32.0f, 28.0f, -32.0f)
                arcToRelative(26.11f, 26.11f, 0.0f, false, true, 18.89f, 8.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.78f, 5.54f)
                arcTo(18.15f, 18.15f, 0.0f, false, false, 64.0f, 156.0f)
                curveTo(53.0f, 156.0f, 44.0f, 166.77f, 44.0f, 180.0f)
                close()
                moveTo(212.0f, 88.0f)
                lineTo(212.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(120.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineToRelative(56.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 88.0f)
                close()
                moveTo(156.0f, 84.0f)
                horizontalLineToRelative(42.34f)
                lineTo(156.0f, 41.65f)
                close()
            }
        }
        .build()
        return _filec!!
    }

private var _filec: ImageVector? = null
