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

public val FillGroup.`Screwdriver-fill`: ImageVector
    get() {
        if (`_screwdriver-fill` != null) {
            return `_screwdriver-fill`!!
        }
        `_screwdriver-fill` = Builder(name = "Screwdriver-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.23f, 22.75f)
                arcToRelative(50.46f, 50.46f, 0.0f, false, false, -71.31f, 0.0f)
                lineTo(108.68f, 76.0f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 104.0f, 87.3f)
                verticalLineTo(104.0f)
                horizontalLineTo(87.17f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, -9.66f, 3.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.82f, 0.72f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(18.7f, 18.71f)
                lineToRelative(-77.0f, 77.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(77.0f, -77.06f)
                lineToRelative(18.71f, 18.71f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, 0.72f, -0.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 3.25f, -9.66f)
                verticalLineTo(152.0f)
                horizontalLineToRelative(16.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 180.0f, 147.3f)
                lineToRelative(53.23f, -53.23f)
                arcToRelative(50.43f, 50.43f, 0.0f, false, false, 0.0f, -71.32f)
                close()
                moveTo(205.66f, 61.64f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.31f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return `_screwdriver-fill`!!
    }

private var `_screwdriver-fill`: ImageVector? = null
