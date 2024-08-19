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

public val BoldGroup.`Paint-brush-household-bold`: ImageVector
    get() {
        if (`_paint-brush-household-bold` != null) {
            return `_paint-brush-household-bold`!!
        }
        `_paint-brush-household-bold` = Builder(name = "Paint-brush-household-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.47f, 22.53f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.91f, 0.0f)
                lineToRelative(-0.39f, 0.4f)
                lineTo(129.61f, 80.61f)
                lineToRelative(-5.8f, -5.79f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(7.52f, 151.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(76.7f, -76.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -39.6f)
                lineToRelative(-5.8f, -5.8f)
                lineToRelative(57.68f, -52.56f)
                lineToRelative(0.4f, -0.39f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 233.47f, 22.53f)
                close()
                moveTo(96.0f, 223.0f)
                lineToRelative(-9.0f, -9.0f)
                lineToRelative(17.51f, -17.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(70.0f, 197.0f)
                lineTo(59.0f, 186.0f)
                lineToRelative(17.52f, -17.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(42.0f, 169.0f)
                lineToRelative(-9.0f, -9.0f)
                lineToRelative(39.0f, -39.0f)
                lineToRelative(63.0f, 63.0f)
                close()
                moveTo(216.66f, 56.31f)
                lineToRelative(-66.73f, 60.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.4f, 17.36f)
                lineToRelative(14.68f, 14.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineTo(152.0f, 167.0f)
                lineTo(89.0f, 104.0f)
                lineToRelative(12.2f, -12.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(14.68f, 14.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.36f, -0.4f)
                lineToRelative(60.81f, -66.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_paint-brush-household-bold`!!
    }

private var `_paint-brush-household-bold`: ImageVector? = null
