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

public val BoldGroup.Aligntop: ImageVector
    get() {
        if (_aligntop != null) {
            return _aligntop!!
        }
        _aligntop = Builder(name = "Aligntop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 40.0f)
                close()
                moveTo(212.0f, 88.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(156.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(136.0f, 88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 88.0f)
                close()
                moveTo(188.0f, 92.0f)
                lineTo(160.0f, 92.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(28.0f)
                close()
                moveTo(120.0f, 88.0f)
                lineTo(120.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(64.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(44.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 68.0f)
                horizontalLineToRelative(36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 120.0f, 88.0f)
                close()
                moveTo(96.0f, 92.0f)
                lineTo(68.0f, 92.0f)
                lineTo(68.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                close()
            }
        }
        .build()
        return _aligntop!!
    }

private var _aligntop: ImageVector? = null
