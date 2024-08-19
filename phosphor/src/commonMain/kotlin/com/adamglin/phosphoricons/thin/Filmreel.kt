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

public val ThinGroup.Filmreel: ImageVector
    get() {
        if (_filmreel != null) {
            return _filmreel!!
        }
        _filmreel = Builder(name = "Filmreel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 220.0f)
                lineTo(167.18f, 220.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 228.0f)
                lineTo(232.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, 92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 100.0f)
                close()
                moveTo(128.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 68.0f)
                close()
                moveTo(148.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 148.0f, 176.0f)
                close()
                moveTo(116.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 176.0f)
                close()
                moveTo(176.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 176.0f, 148.0f)
                close()
                moveTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 116.0f)
                close()
                moveTo(80.0f, 108.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 108.0f)
                close()
                moveTo(80.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 140.0f)
                close()
            }
        }
        .build()
        return _filmreel!!
    }

private var _filmreel: ImageVector? = null
