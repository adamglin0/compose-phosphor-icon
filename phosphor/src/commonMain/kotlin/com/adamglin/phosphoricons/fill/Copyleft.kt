package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Copyleft: ImageVector
    get() {
        if (_copyleft != null) {
            return _copyleft!!
        }
        _copyleft = Builder(name = "Copyleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 56.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 72.0f, 72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 128.0f, 56.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(47.66f, 47.66f, 0.0f, false, true, -38.4f, -19.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -9.61f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -38.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, -9.61f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 128.0f, 176.0f)
                close()
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
