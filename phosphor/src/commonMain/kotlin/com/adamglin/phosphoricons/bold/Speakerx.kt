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

public val BoldGroup.Speakerx: ImageVector
    get() {
        if (_speakerx != null) {
            return _speakerx!!
        }
        _speakerx = Builder(name = "Speakerx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(140.0f, 199.47f)
                lineTo(92.0f, 162.12f)
                lineTo(92.0f, 93.88f)
                lineToRelative(48.0f, -37.34f)
                close()
                moveTo(248.49f, 143.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(216.0f, 145.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(199.0f, 128.0f)
                lineToRelative(-15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(216.0f, 111.0f)
                lineToRelative(15.51f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(233.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerx!!
    }

private var _speakerx: ImageVector? = null
