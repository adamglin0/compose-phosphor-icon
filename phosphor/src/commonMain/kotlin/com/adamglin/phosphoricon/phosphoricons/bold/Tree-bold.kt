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

public val BoldGroup.`Tree-bold`: ImageVector
    get() {
        if (`_tree-bold` != null) {
            return `_tree-bold`!!
        }
        `_tree-bold` = Builder(name = "Tree-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.17f, 59.62f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -146.34f, 0.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 61.17f, 139.0f)
                verticalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(198.64f)
                arcTo(76.26f, 76.26f, 0.0f, false, false, 168.0f, 204.0f)
                lineToRelative(1.92f, 0.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 201.17f, 59.62f)
                close()
                moveTo(169.35f, 180.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 140.0f, 171.79f)
                verticalLineTo(135.42f)
                lineToRelative(41.37f, -20.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -10.74f, -21.46f)
                lineTo(140.0f, 108.58f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(44.58f)
                lineTo(85.37f, 117.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 21.46f)
                lineTo(116.0f, 159.42f)
                verticalLineToRelative(12.37f)
                arcTo(52.24f, 52.24f, 0.0f, false, true, 86.65f, 180.0f)
                curveToRelative(-27.53f, -0.69f, -50.72f, -24.56f, -50.65f, -52.13f)
                arcToRelative(51.81f, 51.81f, 0.0f, false, true, 32.61f, -48.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.78f, -7.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 105.22f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.78f, 7.0f)
                arcTo(51.81f, 51.81f, 0.0f, false, true, 220.0f, 127.85f)
                curveTo(220.08f, 155.41f, 196.88f, 179.29f, 169.35f, 180.0f)
                close()
            }
        }
        .build()
        return `_tree-bold`!!
    }

private var `_tree-bold`: ImageVector? = null
