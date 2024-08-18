package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Pants-fill`: ImageVector
    get() {
        if (`_pants-fill` != null) {
            return `_pants-fill`!!
        }
        `_pants-fill` = Builder(name = "Pants-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.44f, 43.5f)
                lineTo(54.12f, 38.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 70.0f, 24.0f)
                horizontalLineTo(186.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.88f, 14.0f)
                lineToRelative(0.68f, 5.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.5f)
                horizontalLineTo(57.41f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 53.44f, 43.5f)
                close()
                moveTo(169.0f, 64.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 31.0f, 24.0f)
                horizontalLineToRelative(3.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.5f)
                lineToRelative(-2.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.5f)
                close()
                moveTo(52.41f, 88.0f)
                horizontalLineTo(56.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 87.0f, 64.0f)
                horizontalLineTo(54.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.5f)
                lineToRelative(-2.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 52.41f, 88.0f)
                close()
                moveTo(223.88f, 214.0f)
                lineTo(210.56f, 107.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.5f)
                horizontalLineTo(200.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, true, -47.32f, -40.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(39.73f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(103.32f)
                arcTo(48.07f, 48.07f, 0.0f, false, true, 56.0f, 104.0f)
                horizontalLineTo(49.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.5f)
                lineTo(32.12f, 214.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.71f, 15.09f)
                arcTo(16.56f, 16.56f, 0.0f, false, false, 48.39f, 232.0f)
                horizontalLineToRelative(40.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.51f, -12.06f)
                lineToRelative(23.8f, -92.0f)
                lineToRelative(23.79f, 91.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 167.31f, 232.0f)
                horizontalLineToRelative(40.3f)
                arcToRelative(16.54f, 16.54f, 0.0f, false, false, 9.56f, -2.89f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 223.88f, 214.0f)
                close()
            }
        }
        .build()
        return `_pants-fill`!!
    }

private var `_pants-fill`: ImageVector? = null
