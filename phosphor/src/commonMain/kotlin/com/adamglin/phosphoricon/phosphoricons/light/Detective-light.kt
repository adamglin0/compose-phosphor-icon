package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Detective-light`: ImageVector
    get() {
        if (`_detective-light` != null) {
            return `_detective-light`!!
        }
        `_detective-light` = Builder(name = "Detective-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 114.0f)
                lineTo(219.06f, 114.0f)
                lineTo(171.0f, 47.77f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.16f, -0.61f)
                lineTo(135.93f, 62.08f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.14f, 0.17f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -15.58f, 0.0f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.14f, -0.17f)
                lineTo(107.2f, 47.16f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 85.0f, 47.77f)
                lineTo(36.94f, 114.0f)
                lineTo(8.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(248.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(94.75f, 54.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.15f, -0.07f)
                lineToRelative(0.15f, 0.17f)
                lineToRelative(12.86f, 14.92f)
                arcTo(21.88f, 21.88f, 0.0f, false, false, 128.0f, 78.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(21.88f, 21.88f, 0.0f, false, false, 17.09f, -8.16f)
                lineTo(158.0f, 54.92f)
                lineToRelative(0.15f, -0.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.15f, 0.07f)
                lineToRelative(43.0f, 59.18f)
                lineTo(51.77f, 114.0f)
                close()
                moveTo(180.0f, 146.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -33.94f, 32.0f)
                lineTo(109.94f, 178.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -1.44f, 12.0f)
                horizontalLineToRelative(39.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 180.0f, 146.0f)
                close()
                moveTo(76.0f, 202.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 76.0f, 202.0f)
                close()
                moveTo(180.0f, 202.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 180.0f, 202.0f)
                close()
            }
        }
        .build()
        return `_detective-light`!!
    }

private var `_detective-light`: ImageVector? = null
