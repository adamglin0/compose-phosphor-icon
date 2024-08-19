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

public val BoldGroup.`Lock-simple-bold`: ImageVector
    get() {
        if (`_lock-simple-bold` != null) {
            return `_lock-simple-bold`!!
        }
        `_lock-simple-bold` = Builder(name = "Lock-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 76.0f)
                horizontalLineTo(180.0f)
                verticalLineTo(56.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.0f, 56.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 96.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 76.0f)
                close()
                moveTo(100.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(100.0f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(100.0f)
                horizontalLineTo(204.0f)
                close()
            }
        }
        .build()
        return `_lock-simple-bold`!!
    }

private var `_lock-simple-bold`: ImageVector? = null
