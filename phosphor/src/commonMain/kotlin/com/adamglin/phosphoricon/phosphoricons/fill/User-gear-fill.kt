package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`User-gear-fill`: ImageVector
    get() {
        if (`_user-gear-fill` != null) {
            return `_user-gear-fill`!!
        }
        `_user-gear-fill` = Builder(name = "User-gear-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.13f, 194.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 208.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.12f, -13.15f)
                curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 71.9f, 0.0f)
                curveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f)
                close()
                moveTo(255.18f, 154.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.94f, 4.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.0f, -1.07f)
                lineToRelative(-4.67f, -2.7f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, true, -7.58f, 4.39f)
                verticalLineTo(164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-5.38f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, true, -7.58f, -4.39f)
                lineToRelative(-4.67f, 2.7f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.0f, 1.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -14.93f)
                lineToRelative(4.66f, -2.69f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, 0.0f, -8.76f)
                lineToRelative(-4.66f, -2.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -13.86f)
                lineToRelative(4.67f, 2.7f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, true, 7.58f, -4.39f)
                verticalLineTo(108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(5.38f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, true, 7.58f, 4.39f)
                lineToRelative(4.67f, -2.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 13.86f)
                lineToRelative(-4.66f, 2.69f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, 0.0f, 8.76f)
                lineToRelative(4.66f, 2.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 255.18f, 154.0f)
                close()
                moveTo(224.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_user-gear-fill`!!
    }

private var `_user-gear-fill`: ImageVector? = null
