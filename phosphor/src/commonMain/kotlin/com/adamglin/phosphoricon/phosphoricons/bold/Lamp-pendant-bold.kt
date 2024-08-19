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

public val BoldGroup.`Lamp-pendant-bold`: ImageVector
    get() {
        if (`_lamp-pendant-bold` != null) {
            return `_lamp-pendant-bold`!!
        }
        `_lamp-pendant-bold` = Builder(name = "Lamp-pendant-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 72.28f)
                verticalLineTo(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 72.0f)
                verticalLineToRelative(0.28f)
                arcTo(115.7f, 115.7f, 0.0f, false, false, 12.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(84.19f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.62f, 0.0f)
                horizontalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(115.7f, 115.7f, 0.0f, false, false, 180.0f, 72.28f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -19.6f, -16.0f)
                horizontalLineToRelative(39.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 204.0f)
                close()
                moveTo(36.78f, 164.0f)
                arcTo(91.75f, 91.75f, 0.0f, false, true, 92.62f, 91.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 80.0f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.38f, 11.08f)
                arcToRelative(91.75f, 91.75f, 0.0f, false, true, 55.84f, 73.0f)
                close()
            }
        }
        .build()
        return `_lamp-pendant-bold`!!
    }

private var `_lamp-pendant-bold`: ImageVector? = null
