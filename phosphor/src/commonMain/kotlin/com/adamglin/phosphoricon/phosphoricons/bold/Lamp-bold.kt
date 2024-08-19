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

public val BoldGroup.`Lamp-bold`: ImageVector
    get() {
        if (`_lamp-bold` != null) {
            return `_lamp-bold`!!
        }
        `_lamp-bold` = Builder(name = "Lamp-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.0f, 147.27f)
                lineToRelative(-48.0f, -112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 28.0f)
                horizontalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.0f, 7.27f)
                lineToRelative(-48.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 16.0f, 164.0f)
                horizontalLineTo(116.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.73f)
                close()
                moveTo(34.2f, 140.0f)
                lineTo(71.91f, 52.0f)
                horizontalLineTo(184.09f)
                lineToRelative(37.71f, 88.0f)
                close()
            }
        }
        .build()
        return `_lamp-bold`!!
    }

private var `_lamp-bold`: ImageVector? = null
