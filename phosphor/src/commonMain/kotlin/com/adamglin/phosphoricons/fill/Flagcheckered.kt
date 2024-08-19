package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Flagcheckered: ImageVector
    get() {
        if (_flagcheckered != null) {
            return _flagcheckered!!
        }
        _flagcheckered = Builder(name = "Flagcheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.32f, 48.75f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 218.76f, 50.0f)
                curveToRelative(-28.0f, 24.22f, -51.72f, 12.48f, -79.21f, -1.13f)
                curveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 56.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(179.77f)
                curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f)
                curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53.0f, 16.85f)
                curveToRelative(13.93f, 0.0f, 28.54f, -4.75f, 43.82f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 227.32f, 48.75f)
                close()
                moveTo(56.0f, 160.44f)
                verticalLineTo(109.88f)
                curveToRelative(16.85f, -11.28f, 32.64f, -11.59f, 48.0f, -7.34f)
                verticalLineToRelative(51.74f)
                curveTo(88.87f, 150.47f, 72.87f, 150.71f, 56.0f, 160.44f)
                close()
                moveTo(104.0f, 50.87f)
                curveToRelative(9.25f, 2.83f, 18.61f, 7.45f, 28.45f, 12.32f)
                curveToRelative(11.26f, 5.57f, 23.11f, 11.43f, 35.55f, 14.56f)
                verticalLineToRelative(51.74f)
                curveToRelative(15.35f, 4.25f, 31.14f, 3.94f, 48.0f, -7.35f)
                verticalLineToRelative(50.11f)
                curveToRelative(-16.87f, 13.32f, -32.27f, 13.72f, -48.0f, 8.91f)
                verticalLineTo(129.49f)
                curveToRelative(-21.62f, -6.0f, -42.38f, -21.0f, -64.0f, -26.95f)
                close()
            }
        }
        .build()
        return _flagcheckered!!
    }

private var _flagcheckered: ImageVector? = null
