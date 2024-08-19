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

public val BoldGroup.`Globe-simple-bold`: ImageVector
    get() {
        if (`_globe-simple-bold` != null) {
            return `_globe-simple-bold`!!
        }
        `_globe-simple-bold` = Builder(name = "Globe-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(211.13f, 116.0f)
                lineTo(179.56f, 116.0f)
                arcToRelative(144.3f, 144.3f, 0.0f, false, false, -21.35f, -66.36f)
                arcTo(84.22f, 84.22f, 0.0f, false, true, 211.13f, 116.0f)
                close()
                moveTo(128.0f, 207.0f)
                curveToRelative(-9.36f, -10.81f, -24.46f, -33.13f, -27.45f, -67.0f)
                horizontalLineToRelative(54.94f)
                arcToRelative(119.74f, 119.74f, 0.0f, false, true, -17.11f, 52.77f)
                arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 207.0f)
                close()
                moveTo(100.55f, 116.0f)
                arcToRelative(119.74f, 119.74f, 0.0f, false, true, 17.11f, -52.77f)
                arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 49.0f)
                curveToRelative(9.36f, 10.81f, 24.46f, 33.13f, 27.45f, 67.0f)
                close()
                moveTo(97.79f, 49.64f)
                arcTo(144.3f, 144.3f, 0.0f, false, false, 76.44f, 116.0f)
                lineTo(44.87f, 116.0f)
                arcTo(84.22f, 84.22f, 0.0f, false, true, 97.79f, 49.64f)
                close()
                moveTo(44.87f, 140.0f)
                lineTo(76.44f, 140.0f)
                arcToRelative(144.3f, 144.3f, 0.0f, false, false, 21.35f, 66.36f)
                arcTo(84.22f, 84.22f, 0.0f, false, true, 44.87f, 140.0f)
                close()
                moveTo(158.21f, 206.36f)
                arcTo(144.3f, 144.3f, 0.0f, false, false, 179.56f, 140.0f)
                horizontalLineToRelative(31.57f)
                arcTo(84.22f, 84.22f, 0.0f, false, true, 158.21f, 206.36f)
                close()
            }
        }
        .build()
        return `_globe-simple-bold`!!
    }

private var `_globe-simple-bold`: ImageVector? = null
