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

public val BoldGroup.Gitfork: ImageVector
    get() {
        if (_gitfork != null) {
            return _gitfork!!
        }
        _gitfork = Builder(name = "Gitfork", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -48.0f, 33.94f)
                lineTo(180.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(76.0f, 97.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f)
                lineTo(52.0f, 112.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(18.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(204.0f, 97.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 228.0f, 64.0f)
                close()
                moveTo(64.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 52.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 52.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 204.0f)
                close()
                moveTo(192.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 76.0f)
                close()
            }
        }
        .build()
        return _gitfork!!
    }

private var _gitfork: ImageVector? = null
