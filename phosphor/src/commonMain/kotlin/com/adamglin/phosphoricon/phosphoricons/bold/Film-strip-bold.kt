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

public val BoldGroup.`Film-strip-bold`: ImageVector
    get() {
        if (`_film-strip-bold` != null) {
            return `_film-strip-bold`!!
        }
        `_film-strip-bold` = Builder(name = "Film-strip-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(44.0f, 100.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(56.0f)
                lineTo(44.0f, 156.0f)
                close()
                moveTo(140.0f, 76.0f)
                lineTo(140.0f, 60.0f)
                horizontalLineToRelative(24.0f)
                lineTo(164.0f, 76.0f)
                close()
                moveTo(116.0f, 76.0f)
                lineTo(92.0f, 76.0f)
                lineTo(92.0f, 60.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(116.0f, 180.0f)
                verticalLineToRelative(16.0f)
                lineTo(92.0f, 196.0f)
                lineTo(92.0f, 180.0f)
                close()
                moveTo(140.0f, 180.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                lineTo(140.0f, 196.0f)
                close()
                moveTo(140.0f, 156.0f)
                lineTo(140.0f, 100.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(212.0f, 76.0f)
                lineTo(188.0f, 76.0f)
                lineTo(188.0f, 60.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(68.0f, 60.0f)
                lineTo(68.0f, 76.0f)
                lineTo(44.0f, 76.0f)
                lineTo(44.0f, 60.0f)
                close()
                moveTo(44.0f, 180.0f)
                lineTo(68.0f, 180.0f)
                verticalLineToRelative(16.0f)
                lineTo(44.0f, 196.0f)
                close()
                moveTo(188.0f, 196.0f)
                lineTo(188.0f, 180.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_film-strip-bold`!!
    }

private var `_film-strip-bold`: ImageVector? = null
