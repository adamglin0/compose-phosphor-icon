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

public val BoldGroup.`Boot-bold`: ImageVector
    get() {
        if (`_boot-bold` != null) {
            return `_boot-bold`!!
        }
        `_boot-bold` = Builder(name = "Boot-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 104.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.8f, 52.3f)
                curveToRelative(10.88f, 28.39f, 8.3f, 78.36f, -0.33f, 108.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 164.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(66.11f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, 9.0f, -2.11f)
                lineTo(86.83f, 212.0f)
                horizontalLineToRelative(14.34f)
                lineToRelative(11.77f, 5.89f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, 9.0f, 2.11f)
                horizontalLineToRelative(28.22f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, 8.95f, -2.11f)
                lineTo(170.83f, 212.0f)
                horizontalLineToRelative(14.34f)
                lineToRelative(11.77f, 5.89f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, 8.95f, 2.11f)
                horizontalLineTo(232.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(164.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 192.0f, 104.0f)
                close()
                moveTo(48.0f, 60.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, true, 33.94f, 24.0f)
                horizontalLineTo(47.21f)
                curveTo(52.75f, 124.08f, 54.23f, 88.41f, 48.0f, 60.0f)
                close()
                moveTo(228.0f, 196.0f)
                horizontalLineTo(206.83f)
                lineToRelative(-11.77f, -5.89f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, -8.95f, -2.11f)
                horizontalLineTo(169.89f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, -8.95f, 2.11f)
                lineTo(149.17f, 196.0f)
                horizontalLineTo(122.83f)
                lineToRelative(-11.77f, -5.89f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, -9.0f, -2.11f)
                horizontalLineTo(85.89f)
                arcToRelative(20.16f, 20.16f, 0.0f, false, false, -9.0f, 2.11f)
                lineTo(65.17f, 196.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(228.0f)
                close()
            }
        }
        .build()
        return `_boot-bold`!!
    }

private var `_boot-bold`: ImageVector? = null
