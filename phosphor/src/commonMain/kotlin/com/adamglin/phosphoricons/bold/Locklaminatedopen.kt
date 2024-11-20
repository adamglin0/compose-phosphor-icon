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

public val BoldGroup.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) {
            return _lockLaminatedOpen!!
        }
        _lockLaminatedOpen = Builder(name = "LockLaminatedOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 76.0f)
                lineTo(100.0f, 76.0f)
                lineTo(100.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                curveToRelative(13.51f, 0.0f, 25.65f, 9.62f, 28.24f, 22.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.52f, -4.78f)
                curveTo(174.87f, 21.5f, 153.1f, 4.0f, 128.0f, 4.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 76.0f, 56.0f)
                lineTo(76.0f, 76.0f)
                lineTo(48.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 96.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 76.0f)
                close()
                moveTo(52.0f, 144.0f)
                lineTo(204.0f, 144.0f)
                verticalLineToRelative(16.0f)
                lineTo(52.0f, 160.0f)
                close()
                moveTo(204.0f, 100.0f)
                verticalLineToRelative(20.0f)
                lineTo(52.0f, 120.0f)
                lineTo(52.0f, 100.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 184.0f)
                lineTo(204.0f, 184.0f)
                verticalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null
