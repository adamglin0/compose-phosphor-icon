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

public val BoldGroup.`Goodreads-logo-bold`: ImageVector
    get() {
        if (`_goodreads-logo-bold` != null) {
            return `_goodreads-logo-bold`!!
        }
        `_goodreads-logo-bold` = Builder(name = "Goodreads-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.22f)
                arcTo(67.94f, 67.94f, 0.0f, false, false, 60.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(67.94f, 67.94f, 0.0f, false, false, 112.0f, 51.78f)
                verticalLineTo(168.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                curveToRelative(-15.0f, 0.0f, -30.29f, -7.58f, -38.16f, -18.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.68f, 13.74f)
                curveTo(82.5f, 224.56f, 105.21f, 236.0f, 128.0f, 236.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                verticalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 20.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                verticalLineTo(88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_goodreads-logo-bold`!!
    }

private var `_goodreads-logo-bold`: ImageVector? = null
