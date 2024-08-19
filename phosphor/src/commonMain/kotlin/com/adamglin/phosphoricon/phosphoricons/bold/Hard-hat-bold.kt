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

public val BoldGroup.`Hard-hat-bold`: ImageVector
    get() {
        if (`_hard-hat-bold` != null) {
            return `_hard-hat-bold`!!
        }
        `_hard-hat-bold` = Builder(name = "Hard-hat-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 148.4f)
                verticalLineTo(136.0f)
                arcToRelative(100.41f, 100.41f, 0.0f, false, false, -64.0f, -93.3f)
                verticalLineTo(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(112.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 92.0f, 40.0f)
                verticalLineToRelative(2.7f)
                arcTo(100.41f, 100.41f, 0.0f, false, false, 28.0f, 136.0f)
                verticalLineToRelative(12.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(168.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 148.4f)
                close()
                moveTo(204.0f, 136.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(69.07f)
                arcTo(76.35f, 76.35f, 0.0f, false, true, 204.0f, 136.0f)
                close()
                moveTo(140.0f, 44.0f)
                verticalLineTo(148.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(44.0f)
                close()
                moveTo(92.0f, 69.07f)
                verticalLineTo(148.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(136.0f)
                arcTo(76.35f, 76.35f, 0.0f, false, true, 92.0f, 69.07f)
                close()
                moveTo(220.0f, 188.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(172.0f)
                horizontalLineTo(220.0f)
                close()
            }
        }
        .build()
        return `_hard-hat-bold`!!
    }

private var `_hard-hat-bold`: ImageVector? = null
