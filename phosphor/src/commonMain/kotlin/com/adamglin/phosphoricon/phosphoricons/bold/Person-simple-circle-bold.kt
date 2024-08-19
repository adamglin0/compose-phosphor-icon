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

public val BoldGroup.`Person-simple-circle-bold`: ImageVector
    get() {
        if (`_person-simple-circle-bold` != null) {
            return `_person-simple-circle-bold`!!
        }
        `_person-simple-circle-bold` = Builder(name = "Person-simple-circle-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(108.0f, 80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 80.0f)
                close()
                moveTo(184.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(140.0f, 132.0f)
                verticalLineToRelative(0.51f)
                lineToRelative(26.12f, 41.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.68f, 16.56f)
                arcTo(11.83f, 11.83f, 0.0f, false, true, 156.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.13f, -5.56f)
                lineTo(128.0f, 158.35f)
                lineToRelative(-17.88f, 28.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.24f, -12.88f)
                lineTo(116.0f, 132.51f)
                lineTo(116.0f, 132.0f)
                lineTo(84.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_person-simple-circle-bold`!!
    }

private var `_person-simple-circle-bold`: ImageVector? = null
