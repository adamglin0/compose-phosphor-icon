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

public val LightGroup.`Dots-nine-light`: ImageVector
    get() {
        if (`_dots-nine-light` != null) {
            return `_dots-nine-light`!!
        }
        `_dots-nine-light` = Builder(name = "Dots-nine-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.0f, 60.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 60.0f, 50.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 70.0f, 60.0f)
                close()
                moveTo(128.0f, 50.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 50.0f)
                close()
                moveTo(196.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 196.0f, 70.0f)
                close()
                moveTo(60.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 60.0f, 118.0f)
                close()
                moveTo(128.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 118.0f)
                close()
                moveTo(196.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 196.0f, 118.0f)
                close()
                moveTo(60.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 60.0f, 186.0f)
                close()
                moveTo(128.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 186.0f)
                close()
                moveTo(196.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 196.0f, 186.0f)
                close()
            }
        }
        .build()
        return `_dots-nine-light`!!
    }

private var `_dots-nine-light`: ImageVector? = null
