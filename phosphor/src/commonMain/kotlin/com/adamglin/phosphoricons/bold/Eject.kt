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

public val BoldGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 152.0f)
                lineTo(48.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 172.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 152.0f)
                close()
                moveTo(204.0f, 188.0f)
                lineTo(52.0f, 188.0f)
                lineTo(52.0f, 176.0f)
                lineTo(204.0f, 176.0f)
                close()
                moveTo(48.27f, 136.0f)
                lineTo(207.73f, 136.0f)
                arcToRelative(20.27f, 20.27f, 0.0f, false, false, 14.61f, -34.3f)
                lineTo(148.58f, 24.78f)
                arcToRelative(28.51f, 28.51f, 0.0f, false, false, -41.16f, 0.0f)
                lineTo(33.66f, 101.7f)
                arcTo(20.27f, 20.27f, 0.0f, false, false, 48.27f, 136.0f)
                close()
                moveTo(124.75f, 41.39f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, 6.5f, 0.0f)
                lineTo(199.0f, 112.0f)
                lineTo(57.0f, 112.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
