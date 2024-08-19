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

public val BoldGroup.`Nut-bold`: ImageVector
    get() {
        if (`_nut-bold` != null) {
            return `_nut-bold`!!
        }
        `_nut-bold` = Builder(name = "Nut-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 128.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, -52.0f)
                arcTo(52.05f, 52.05f, 0.0f, false, false, 76.0f, 128.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 128.0f)
                close()
                moveTo(225.6f, 62.64f)
                lineTo(137.6f, 14.47f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -19.2f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.19f)
                verticalLineToRelative(95.62f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.55f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.2f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                horizontalLineToRelative(0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 175.81f)
                lineTo(236.0f, 80.19f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 225.6f, 62.64f)
                close()
                moveTo(212.0f, 173.44f)
                lineToRelative(-84.0f, 46.0f)
                lineToRelative(-84.0f, -46.0f)
                lineTo(44.0f, 82.56f)
                lineToRelative(84.0f, -46.0f)
                lineToRelative(84.0f, 46.0f)
                close()
            }
        }
        .build()
        return `_nut-bold`!!
    }

private var `_nut-bold`: ImageVector? = null
