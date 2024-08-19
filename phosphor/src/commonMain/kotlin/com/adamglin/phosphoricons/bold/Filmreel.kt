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

public val BoldGroup.Filmreel: ImageVector
    get() {
        if (_filmreel != null) {
            return _filmreel!!
        }
        _filmreel = Builder(name = "Filmreel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 212.0f)
                lineTo(195.8f, 212.0f)
                arcTo(107.94f, 107.94f, 0.0f, true, false, 128.0f, 236.0f)
                lineTo(232.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(108.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 84.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 128.0f)
                close()
                moveTo(104.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
            }
        }
        .build()
        return _filmreel!!
    }

private var _filmreel: ImageVector? = null
