package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Infinity-bold`: ImageVector
    get() {
        if (`_infinity-bold` != null) {
            return `_infinity-bold`!!
        }
        `_infinity-bold` = Builder(name = "Infinity-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -102.43f, 42.43f)
                lineToRelative(-0.49f, -0.53f)
                lineTo(89.22f, 102.31f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 51.38f)
                lineToRelative(3.08f, -3.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 18.0f, 15.91f)
                lineToRelative(-3.35f, 3.78f)
                lineToRelative(-0.49f, 0.53f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 0.0f, -84.86f)
                lineToRelative(0.49f, 0.53f)
                lineToRelative(59.86f, 67.59f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, -51.38f)
                lineToRelative(-3.08f, 3.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.0f, -15.91f)
                lineToRelative(3.35f, -3.78f)
                lineToRelative(0.49f, -0.53f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_infinity-bold`!!
    }

private var `_infinity-bold`: ImageVector? = null
