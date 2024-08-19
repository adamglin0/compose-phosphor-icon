package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Boules-thin`: ImageVector
    get() {
        if (`_boules-thin` != null) {
            return `_boules-thin`!!
        }
        `_boules-thin` = Builder(name = "Boules-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(190.13f, 60.21f)
                lineTo(60.21f, 190.13f)
                arcToRelative(91.94f, 91.94f, 0.0f, false, true, -14.88f, -21.8f)
                lineToRelative(123.0f, -123.0f)
                arcTo(91.94f, 91.94f, 0.0f, false, true, 190.13f, 60.21f)
                close()
                moveTo(195.79f, 65.87f)
                arcToRelative(92.24f, 92.24f, 0.0f, false, true, 14.88f, 21.8f)
                lineToRelative(-123.0f, 123.0f)
                arcToRelative(92.24f, 92.24f, 0.0f, false, true, -21.8f, -14.88f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, 32.43f, 5.91f)
                lineTo(41.91f, 160.43f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, -32.43f, -5.91f)
                lineTo(214.09f, 95.57f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_boules-thin`!!
    }

private var `_boules-thin`: ImageVector? = null
