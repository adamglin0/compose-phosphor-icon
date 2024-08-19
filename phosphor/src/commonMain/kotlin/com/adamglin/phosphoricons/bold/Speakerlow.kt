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

public val BoldGroup.Speakerlow: ImageVector
    get() {
        if (_speakerlow != null) {
            return _speakerlow!!
        }
        _speakerlow = Builder(name = "Speakerlow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.27f, 21.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.64f, 1.31f)
                lineTo(75.88f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(75.88f, 180.0f)
                lineToRelative(68.75f, 53.47f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 224.0f)
                lineTo(164.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 157.27f, 21.22f)
                close()
                moveTo(36.0f, 100.0f)
                lineTo(68.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(36.0f, 156.0f)
                close()
                moveTo(140.0f, 199.46f)
                lineTo(92.0f, 162.13f)
                lineTo(92.0f, 93.87f)
                lineToRelative(48.0f, -37.33f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -11.0f, 29.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.0f, -15.88f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -26.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.0f, -15.85f)
                arcTo(43.94f, 43.94f, 0.0f, false, true, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerlow!!
    }

private var _speakerlow: ImageVector? = null
