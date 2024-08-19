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

public val BoldGroup.Cloudsnow: ImageVector
    get() {
        if (_cloudsnow != null) {
            return _cloudsnow!!
        }
        _cloudsnow = Builder(name = "Cloudsnow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 208.0f)
                close()
                moveTo(120.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 192.0f)
                close()
                moveTo(72.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 192.0f)
                close()
                moveTo(236.0f, 92.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, true, -80.0f, 80.0f)
                lineTo(76.0f, 172.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 76.0f, 60.0f)
                arcToRelative(56.76f, 56.76f, 0.0f, false, true, 6.39f, 0.36f)
                arcTo(80.08f, 80.08f, 0.0f, false, true, 236.0f, 92.0f)
                close()
                moveTo(212.0f, 92.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -112.0f, -3.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, -1.38f)
                curveToRelative(0.06f, -1.11f, 0.15f, -2.21f, 0.26f, -3.31f)
                lineTo(76.0f, 84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(80.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 212.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudsnow!!
    }

private var _cloudsnow: ImageVector? = null
