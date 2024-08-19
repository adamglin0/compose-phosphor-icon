package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Spray-bottle`: ImageVector
    get() {
        if (`_spray-bottle` != null) {
            return `_spray-bottle`!!
        }
        `_spray-bottle` = Builder(name = "Spray-bottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                horizontalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 32.0f)
                verticalLineTo(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 80.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(24.62f)
                arcToRelative(23.87f, 23.87f, 0.0f, false, true, -9.0f, 18.74f)
                lineTo(87.0f, 136.15f)
                arcToRelative(39.79f, 39.79f, 0.0f, false, false, -15.0f, 31.23f)
                verticalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(211.47f)
                arcTo(270.88f, 270.88f, 0.0f, false, false, 174.0f, 80.0f)
                close()
                moveTo(80.0f, 32.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(40.08f, 40.08f, 0.0f, false, true, 39.2f, 32.0f)
                horizontalLineTo(80.0f)
                close()
                moveTo(192.0f, 211.47f)
                verticalLineTo(224.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(167.38f)
                arcToRelative(23.87f, 23.87f, 0.0f, false, true, 9.0f, -18.74f)
                lineToRelative(16.0f, -12.79f)
                arcToRelative(39.79f, 39.79f, 0.0f, false, false, 15.0f, -31.23f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(27.52f)
                arcTo(254.86f, 254.86f, 0.0f, false, true, 192.0f, 211.47f)
                close()
            }
        }
        .build()
        return `_spray-bottle`!!
    }

private var `_spray-bottle`: ImageVector? = null
