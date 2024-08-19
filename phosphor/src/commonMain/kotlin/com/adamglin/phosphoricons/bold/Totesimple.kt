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

public val BoldGroup.Totesimple: ImageVector
    get() {
        if (_totesimple != null) {
            return _totesimple!!
        }
        _totesimple = Builder(name = "Totesimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.0f, 66.75f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -15.0f, -6.75f)
                lineTo(179.83f, 60.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.17f, 60.0f)
                lineTo(32.08f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.14f, 82.35f)
                lineToRelative(14.25f, 120.0f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 46.33f, 220.0f)
                lineTo(209.67f, 220.0f)
                arcToRelative(20.06f, 20.06f, 0.0f, false, false, 19.94f, -17.65f)
                lineToRelative(14.25f, -120.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 239.0f, 66.75f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.71f, 24.0f)
                lineTo(100.29f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(206.19f, 196.0f)
                lineTo(49.81f, 196.0f)
                lineTo(36.5f, 84.0f)
                horizontalLineToRelative(183.0f)
                close()
            }
        }
        .build()
        return _totesimple!!
    }

private var _totesimple: ImageVector? = null
