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

public val BoldGroup.`Picture-in-picture-bold`: ImageVector
    get() {
        if (`_picture-in-picture-bold` != null) {
            return `_picture-in-picture-bold`!!
        }
        `_picture-in-picture-bold` = Builder(name = "Picture-in-picture-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(44.0f, 68.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(60.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(148.0f, 188.0f)
                verticalLineTo(140.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return `_picture-in-picture-bold`!!
    }

private var `_picture-in-picture-bold`: ImageVector? = null
