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

public val BoldGroup.`Bell-simple-bold`: ImageVector
    get() {
        if (`_bell-simple-bold` != null) {
            return `_bell-simple-bold`!!
        }
        `_bell-simple-bold` = Builder(name = "Bell-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.29f, 165.93f)
                curveTo(216.61f, 151.0f, 212.0f, 129.57f, 212.0f, 104.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                curveToRelative(0.0f, 25.58f, -4.59f, 47.0f, -13.27f, 61.93f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 30.66f, 186.0f)
                arcTo(19.77f, 19.77f, 0.0f, false, false, 48.0f, 196.0f)
                horizontalLineTo(208.0f)
                arcToRelative(19.77f, 19.77f, 0.0f, false, false, 17.31f, -10.0f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 225.29f, 165.93f)
                close()
                moveTo(54.66f, 172.0f)
                curveTo(63.51f, 154.0f, 68.0f, 131.14f, 68.0f, 104.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f)
                curveToRelative(0.0f, 27.13f, 4.48f, 50.0f, 13.33f, 68.0f)
                close()
                moveTo(172.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_bell-simple-bold`!!
    }

private var `_bell-simple-bold`: ImageVector? = null
