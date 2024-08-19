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

public val BoldGroup.Handpointing: ImageVector
    get() {
        if (_handpointing != null) {
            return _handpointing!!
        }
        _handpointing = Builder(name = "Handpointing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 84.0f)
                arcToRelative(31.94f, 31.94f, 0.0f, false, false, -11.22f, 2.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 148.0f, 69.0f)
                lineTo(148.0f, 44.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(66.83f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 32.25f, 148.0f)
                lineToRelative(4.68f, 8.24f)
                curveTo(71.11f, 216.48f, 86.72f, 244.0f, 136.0f, 244.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                lineTo(228.0f, 116.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 196.0f, 84.0f)
                close()
                moveTo(204.0f, 152.0f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, true, -68.0f, 68.0f)
                curveToRelative(-34.0f, 0.0f, -43.49f, -14.45f, -78.2f, -75.65f)
                lineToRelative(-4.69f, -8.28f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, 0.0f, -0.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.86f, -8.0f)
                curveToRelative(0.06f, 0.12f, 0.13f, 0.23f, 0.2f, 0.35f)
                lineToRelative(18.68f, 30.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 152.0f)
                lineTo(108.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(148.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handpointing!!
    }

private var _handpointing: ImageVector? = null
