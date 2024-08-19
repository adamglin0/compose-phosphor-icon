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

public val BoldGroup.`Dress-bold`: ImageVector
    get() {
        if (`_dress-bold` != null) {
            return `_dress-bold`!!
        }
        `_dress-bold` = Builder(name = "Dress-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.38f, 208.12f)
                curveToRelative(-0.06f, -0.12f, -0.11f, -0.25f, -0.17f, -0.37f)
                lineToRelative(-44.54f, -94.87f)
                lineTo(193.0f, 82.56f)
                curveToRelative(0.06f, -0.09f, 0.12f, -0.18f, 0.17f, -0.27f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -20.58f)
                curveToRelative(-0.14f, -0.24f, -0.3f, -0.48f, -0.46f, -0.71f)
                lineTo(172.0f, 31.44f)
                verticalLineTo(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(31.0f)
                lineToRelative(-4.38f, 5.47f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -31.24f, 0.0f)
                lineTo(108.0f, 31.0f)
                verticalLineTo(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(31.44f)
                lineTo(63.31f, 61.0f)
                curveToRelative(-0.16f, 0.23f, -0.32f, 0.47f, -0.46f, 0.71f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 20.58f)
                curveToRelative(0.0f, 0.09f, 0.11f, 0.18f, 0.17f, 0.27f)
                lineToRelative(19.31f, 30.32f)
                lineTo(37.79f, 207.75f)
                curveToRelative(-0.06f, 0.12f, -0.11f, 0.25f, -0.17f, 0.37f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 236.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.39f, -27.88f)
                close()
                moveTo(128.0f, 68.0f)
                arcToRelative(43.75f, 43.75f, 0.0f, false, false, 31.21f, -13.0f)
                lineToRelative(12.0f, 17.1f)
                lineTo(153.42f, 100.0f)
                horizontalLineTo(102.58f)
                lineTo(84.82f, 72.12f)
                lineToRelative(12.0f, -17.1f)
                arcTo(43.75f, 43.75f, 0.0f, false, false, 128.0f, 68.0f)
                close()
                moveTo(62.31f, 212.0f)
                lineToRelative(41.31f, -88.0f)
                horizontalLineToRelative(48.76f)
                lineToRelative(41.31f, 88.0f)
                close()
            }
        }
        .build()
        return `_dress-bold`!!
    }

private var `_dress-bold`: ImageVector? = null
